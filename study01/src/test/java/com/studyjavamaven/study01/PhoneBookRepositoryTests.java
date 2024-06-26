package com.studyjavamaven.study01;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;
import sangbongtest0628.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneBookRepositoryTests {
    @Test
    public void jsonRepositoryTest() throws Exception {
        PhoneBookJsonRepository repository = new PhoneBookJsonRepository("test.json");
        //given, when
        //Throwable ex = assertThrows(Exception.class, () -> repository.getObjectFromJson(""));
        //System.out.println(ex.toString());

        String json = "{\"phoneNumber\":\"010-0000-0000\",\"name\":\"이말자\",\"id\":7\"email\":\"asdfg@gm.com\",\"group\":\"Jobs\"}";
        JSONParser jsonParser = new JSONParser();
        IPhoneBook object = null;

        Object obj = jsonParser.parse(json);

        object = repository.getObjectFromJson((JSONObject) obj);
        assertThat(object.getId()).isEqualTo(7L);
        assertThat(object.getName()).isEqualTo("이말자");
        assertThat(object.getGroup()).isEqualTo(EPhoneGroup.Jobs);
        assertThat(object.getPhoneNumber()).isEqualTo("010-0000-0000");
        assertThat(object.getEmail()).isEqualTo("asdfg@gm.com");

        IPhoneBook iPhoneBook2 = new PhoneBook();
        iPhoneBook2.setId(88L);
        iPhoneBook2.setName("폰북");
        iPhoneBook2.setGroup(EPhoneGroup.Hobbies);
        iPhoneBook2.setPhoneNumber("1111-2222");
        iPhoneBook2.setEmail("abcdefg@daum.net");
        JSONObject jobject = repository.getJsonFromObject(iPhoneBook2);
        assertThat((Long)jobject.get("id")).isEqualTo(88L);
        assertThat((String)jobject.get("name")).isEqualTo("폰북");
        assertThat((String)jobject.get("group")).isEqualTo("Hobbies");
        assertThat((String)jobject.get("phoneNumber")).isEqualTo("1111-2222");
        assertThat((String)jobject.get("email")).isEqualTo("abcdefg@daum.net");
    }

    @Test
    public void textRepositoryTest() throws Exception {
        PhoneBookTextRepository repository = new PhoneBookTextRepository("test.text");
        Throwable ex = assertThrows(Exception.class, () -> repository.getObjectFromText(""));
        System.out.println(ex.toString());

        IPhoneBook phoneBook = repository.getObjectFromText("3,홍길동,Families,010-1111-1111,abcd@gmail.com");
        assertThat(phoneBook.getId()).isEqualTo(3L);
        assertThat(phoneBook.getName()).isEqualTo("홍길동");
        assertThat(phoneBook.getGroup()).isEqualTo(EPhoneGroup.Families);
        assertThat(phoneBook.getPhoneNumber()).isEqualTo("010-1111-1111");
        assertThat(phoneBook.getEmail()).isEqualTo("abcd@gmail.com");

        String str = repository.getTextFromObject(phoneBook);
        assertThat(str).isEqualTo("3, 홍길동, Families, 010-1111-1111, abcd@gmail.com\n");
    }

}
