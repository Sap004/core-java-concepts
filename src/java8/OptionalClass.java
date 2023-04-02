package src.java8;

import java.util.Optional;

public class OptionalClass {

    public void doIt(){
        Optional GOT= Optional.of("Game Of Thrones");
        String[] str=new String[10];
        Optional strOptional=Optional.ofNullable(str[9]);

        System.out.println(strOptional.isPresent());
        System.out.println(GOT.isPresent());
    }





}
