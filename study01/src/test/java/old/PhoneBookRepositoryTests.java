/*
package com.studyjavamaven.study01;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;
import test0628.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneBookRepositoryTests {
    @Test
    public void jsonRepositoryTest() throws Exception {
        PhoneBookJsonRepository repository = new PhoneBookJsonRepository("test.json");
        String json = "{\"id\":3,\"name\":\"이선호\",\"phoneNumber\":\"010-3130-3792\",\"group\":\"Jobs\",\"email\":\"sun001017@naver.com\"}";

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(json);
        IPhoneBook phoneBook = repository.getObjectFromJson((JSONObject)obj);
        assertThat(phoneBook.getId()).isEqualTo(3L);
        assertThat(phoneBook.getName()).isEqualTo("이선호");
        assertThat(phoneBook.getPhoneNumber()).isEqualTo("010-3130-3792");
        assertThat(phoneBook.getGroup()).isEqualTo(EPhoneGroup.Jobs);
        assertThat(phoneBook.getGroup().toString()).isEqualTo("Jobs");
        assertThat(phoneBook.getEmail()).isEqualTo("sun001017@naver.com");

        IPhoneBook phoneBook2 = new PhoneBook();
        phoneBook2.setId(13L);
        phoneBook2.setName("선호");
        phoneBook2.setPhoneNumber("1234-5678");
        phoneBook2.setGroup(EPhoneGroup.Hobbies);
        phoneBook2.setEmail("sunho@gmail.com");
        JSONObject jobject = repository.getJsonFromObject(phoneBook2);
        assertThat((Long)jobject.get("id")).isEqualTo(13L);
        assertThat((String)jobject.get("name")).isEqualTo("선호");
        assertThat((String)jobject.get("phoneNumber")).isEqualTo("1234-5678");
        assertThat(EPhoneGroup.valueOf((String)jobject.get("group"))).isEqualTo(EPhoneGroup.Hobbies);
        assertThat((String)jobject.get("group")).isEqualTo("Hobbies");
        assertThat((String)jobject.get("email")).isEqualTo("sunho@gmail.com");
        assertThat(jobject.toJSONString()).isEqualTo("{\"phoneNumber\":\"1234-5678\",\"name\":\"선호\",\"id\":13,\"email\":\"sunho@gmail.com\",\"group\":\"Hobbies\"}");
    }

    @Test
    public void textRepositoryTest() throws Exception {
        PhoneBookTextRepository repository = new PhoneBookTextRepository("test.txt");
        Throwable ex = assertThrows(Exception.class, () -> repository.getObjectFromText(""));
        System.out.println(ex.toString());

        IPhoneBook phoneBook = repository.getObjectFromText("3,이선호,Friends,010-3130-3792,sunho@gmail.com");
        assertThat(phoneBook.getId()).isEqualTo(3L);
        assertThat(phoneBook.getName()).isEqualTo("이선호");
        assertThat(phoneBook.getPhoneNumber()).isEqualTo("010-3130-3792");
        assertThat(phoneBook.getGroup()).isEqualTo(EPhoneGroup.Friends);
        assertThat(phoneBook.getEmail()).isEqualTo("sunho@gmail.com");

        String str = repository.getTextFromObject(phoneBook);
        assertThat(str).isEqualTo("3,이선호,Friends,010-3130-3792,sunho@gmail.com\n");
    }


}

*/
