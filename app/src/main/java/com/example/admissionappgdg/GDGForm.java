package com.example.admissionappgdg;

import java.io.Serializable;

public class GDGForm implements Serializable {

    String name;
    String whyPara;
    String subBranch;
    String skill;
    int age;
    boolean isAgree;

    public GDGForm(String name, String subBranch, String skill, String whyPara, int age, boolean isAgree ){
        this.name = name;
        this.subBranch = subBranch;
        this.skill = skill;
        this.whyPara = whyPara;
        this.age = age;
        this.isAgree = isAgree;
    }

    public String getName() {
        return name;
    }

    public String getWhyPara() {
        return whyPara;
    }

    public String getSubBranch() {
        return subBranch;
    }

    public String getSkill() {
        return skill;
    }

    public int getAge() {
        return age;
    }

    public boolean isAgree() {
        return isAgree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWhyPara(String whyPara) {
        this.whyPara = whyPara;
    }

    public void setSubBranch(String subBranch) {
        this.subBranch = subBranch;
    }

    public void setSkil(String skill) {
        this.skill = skill;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAgree(boolean agree) {
        isAgree = agree;
    }
}
