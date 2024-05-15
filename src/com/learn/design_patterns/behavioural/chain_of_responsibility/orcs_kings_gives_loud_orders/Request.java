package com.learn.design_patterns.behavioural.chain_of_responsibility.orcs_kings_gives_loud_orders;

public class Request {
    private final RequestType requestType;
    private final String requestDescription;
    private Boolean handled;

    public Request(RequestType requestType, String desc){
        this.requestType = requestType;
        this.requestDescription = desc;
    }

    public void markHandled(){
        handled = true;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    @Override
    public String toString(){
        return getRequestDescription();
    }
}
