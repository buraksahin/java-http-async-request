package com.buraksahin.eventlistener;

public class EventHandler {
    public static void main(String[] args) {
        Button button = new Button("test");
        button.setEventListener(new ClickEventHandler() {
            @Override
            public void handleClick() {
                System.out.println("Button Clicked");
            }
        });
        button.onClick();
    }
}
