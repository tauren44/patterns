package com.mateacademy.adapter;

public class Adapter extends JSDeveloper implements Developer {
    @Override
    public void codeBackEnd() {
        codeBackEndNodeJs();
    }

    @Override
    public void codeFrontEnd() {
        codeFrontEndReact();
    }
}
