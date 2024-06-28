package com.studyjavamaven.study01;

import test0628.*;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneBookServiceTests {
    @Test
    public void phoneBookServiceImplTest() throws Exception {
        IPhoneBookService<IPhoneBook> jsonService = new PhoneBookServiceImple("-j", "test.json");
        IPhoneBookService<IPhoneBook> textService = new PhoneBookServiceImple("-t", "test.txt");
        File jsonFile = new File("test.json");
        File textFile = new File("test.txt");
        jsonFile.delete();
        textFile.delete();
        assertThat(jsonFile.exists()).isEqualTo(false);
        assertThat(textFile.exists()).isEqualTo(false);

        assertThat(jsonService.size()).isEqualTo(0);
        IPhoneBook add1 = PhoneBook.builder().id(1L).name("add1")
                .group(EPhoneGroup.Friends).phoneNumber("11-1111-1111")
                .email("add1@gmail.com").build();
        IPhoneBook add2 = PhoneBook.builder().id(2L).name("add2")
                .group(EPhoneGroup.Jobs).phoneNumber("222-2222-2222")
                .email("add2@gmail.com").build();
        IPhoneBook add3 = PhoneBook.builder().id(3L).name("add3")
                .group(EPhoneGroup.Hobbies).phoneNumber("333-3333-3333")
                .email("add3@gmail.com").build();

        //insert test
        jsonService.insert(add1);
        textService.insert(add1);
        assertThat(jsonService.size()).isEqualTo(1);
        assertThat(textService.size()).isEqualTo(1);
        jsonService.insert(add2);
        jsonService.insert(add3);
        textService.insert(add2);
        textService.insert(add3);
        //size test
        assertThat(jsonService.size()).isEqualTo(3);
        assertThat(textService.size()).isEqualTo(3);
        //find test
        IPhoneBook find = jsonService.findById(2L);
        assertThat(find.getName()).isEqualTo("add2");
        assertThat(find.getGroup()).isEqualTo(EPhoneGroup.Jobs);
        assertThat(find.getPhoneNumber()).isEqualTo("222-2222-2222");
        assertThat(find.getEmail()).isEqualTo("add2@gmail.com");

        IPhoneBook find2 = textService.findById(2L);
        assertThat(find2.getName()).isEqualTo("add2");
        assertThat(find2.getGroup()).isEqualTo(EPhoneGroup.Jobs);
        assertThat(find2.getPhoneNumber()).isEqualTo("222-2222-2222");
        assertThat(find2.getEmail()).isEqualTo("add2@gmail.com");
        // maxId test
        assertThat(jsonService.getMaxId()).isEqualTo(4L);
        assertThat(textService.getMaxId()).isEqualTo(4L);
        // remove test
        assertThat(jsonService.remove(2L)).isEqualTo(true);
        assertThat(jsonService.size()).isEqualTo(2);
        assertThat(textService.remove(2L)).isEqualTo(true);
        assertThat(textService.size()).isEqualTo(2);
        // getListFromName test
        assertThat(jsonService.getListFromName("add").size()).isEqualTo(2);
        assertThat(textService.getListFromName("add").size()).isEqualTo(2);

        // insert fields test
        jsonService.insert("add4", EPhoneGroup.Friends, "444-4444-4444", "add4@gmail.com");
        assertThat(jsonService.size()).isEqualTo(3);
        assertThat(jsonService.getMaxId()).isEqualTo(5L);
        textService.insert("add4", EPhoneGroup.Friends, "444-4444-4444", "add4@gmail.com");
        assertThat(textService.size()).isEqualTo(3);
        assertThat(textService.getMaxId()).isEqualTo(5L);
        // getListFromName test
        assertThat(jsonService.getListFromGroup(EPhoneGroup.Friends).size()).isEqualTo(2);
        assertThat(textService.getListFromGroup(EPhoneGroup.Friends).size()).isEqualTo(2);

        // save file test
        assertThat(jsonService.saveData()).isEqualTo(true);
        assertThat(textService.saveData()).isEqualTo(true);
        assertThat(jsonFile.exists()).isEqualTo(true);
        assertThat(jsonFile.length()).isEqualTo(297L);
        assertThat(textFile.exists()).isEqualTo(true);
        assertThat(textFile.length()).isEqualTo(131L);

        // load file test;
        jsonService.getAllList().clear();
        textService.getAllList().clear();
        assertThat(jsonService.size()).isEqualTo(0);
        assertThat(textService.size()).isEqualTo(0);
        assertThat(jsonService.loadData()).isEqualTo(true);
        assertThat(textService.loadData()).isEqualTo(true);
        assertThat(jsonService.size()).isEqualTo(3);
        assertThat(textService.size()).isEqualTo(3);
    }
}