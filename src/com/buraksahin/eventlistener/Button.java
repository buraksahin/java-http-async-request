package com.buraksahin.eventlistener;

class Button {
    String id;
    String name;
    ClickEventHandler eventListener;
    public Button(String name){
        this.name = name;
    }

    public void onClick(){
        if(eventListener != null){
            eventListener.handleClick();
        }
    }
    public void setEventListener(ClickEventHandler clickHandler) {
        this.eventListener = clickHandler;
    }
}


