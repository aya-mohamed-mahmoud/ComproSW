package miu.edu.comproTM;

import miu.edu.comproTM.controller.TmInstructorController;
import miu.edu.comproTM.model.InstructorStudent;
import miu.edu.comproTM.model.SessionAttendance;
import miu.edu.comproTM.model.TmInstructor;
import miu.edu.comproTM.model.helpers.InstructorViewModel;
import miu.edu.comproTM.model.helpers.SessionType;
import miu.edu.comproTM.service.TmInstructorService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@WebMvcTest(value = TmInstructorController.class)
public class TmControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TmInstructorService tmInstructorService;

    List<InstructorViewModel> instructorsTestData;
    List<SessionAttendance> appointmentsTestData;
    String instructor;

    @Before
    public void setUp(){

        instructorsTestData = new ArrayList<>();
        InstructorViewModel instructor_viewModel = new InstructorViewModel(1,"Alex","Trains TM","ID0215", LocalDate.of(2020,9,23));
        instructorsTestData.add(instructor_viewModel);


        appointmentsTestData = new ArrayList<>();
        SessionAttendance sessionAttendance = new SessionAttendance(1, LocalDate.of(2020,9,23), SessionType.inperson,true, new InstructorStudent());
        appointmentsTestData.add(sessionAttendance);

        instructor = "{\n" +
                "  \"hiringDate\": \"2020-09-24\",\n" +
                "  \"id\": 0,\n" +
                "  \"name\": \"Hiwot\",\n" +
                "  \"officeID\": \"OF1245\",\n" +
                "  \"responsibiltyDesc\": \"Hello\"\n" +
                "}";
    }
    // Tests if the controller for get instructors work just fine.
    @Test
    public void getListOfInstructors() throws Exception {
        Mockito.when(tmInstructorService.getAllInstructors()).thenReturn(instructorsTestData);
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/tm/instructor/list").accept(
                MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        String expected = "[{\"id\":1,\"name\":\"Alex\",\"responsibiltyDesc\":\"Trains TM\",\"officeID\":\"ID0215\",\"hiringDate\":\"2020-09-23\"}]";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
        assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
    }


    // Tests if the controller for get instructors work just fine.
    @Test
    public void getListOfAppointments() throws Exception {
        Mockito.when(tmInstructorService.getSessionAttendances()).thenReturn(appointmentsTestData);
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/tm/session/allAppointments").accept(
                MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        System.out.println(result);
        String expected = "[{\"date\":\"2020-09-23\",\"type\":\"inperson\",\"meditationAttendance\":true,\"instructorStudent\":{\"id\":null,\"studentId\":null,\"instructor\":null},\"id\":1}]";
        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
        assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
    }

    //
    @Test
    public void createInstructor() throws Exception {
        Mockito.when(tmInstructorService.saveTmInstructor(Mockito.any(TmInstructor.class))).thenReturn(true);
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/tm/instructor/save")
                .accept(MediaType.APPLICATION_JSON).content(instructor)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response = result.getResponse();
        assertEquals(HttpStatus.OK.value(), response.getStatus());
    }

}