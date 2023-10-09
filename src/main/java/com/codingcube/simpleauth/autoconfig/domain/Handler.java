package com.codingcube.simpleauth.autoconfig.domain;


import com.alibaba.fastjson.annotation.JSONField;
import com.codingcube.simpleauth.auth.handler.AutoAuthHandler;

public class Handler {
    @JSONField(name = "id")
    private String id;
    @JSONField(name = "class")
    private String clazz;
    private Class<? extends AutoAuthHandler> handlerClass;
    @JSONField(name = "scope")
    private String scope;
    @JSONField(name = "pathsId")
    private String pathId;
    @JSONField(name = "paths")
    private Paths paths;

    public Handler(String id, String clazz, String scope, String pathId) {
        this.id = id;
        this.clazz = clazz;
        this.scope = scope;
        this.pathId = pathId;
    }

    public Class<? extends AutoAuthHandler> getHandlerClass() {
        return handlerClass;
    }

    public void setHandlerClass(Class<? extends AutoAuthHandler> handlerClass) {
        this.handlerClass = handlerClass;
    }

    public Handler(String id, String pathId) {
        this.id = id;
        this.pathId = pathId;
    }

    public Handler(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getPathId() {
        return pathId;
    }

    public void setPathId(String pathId) {
        this.pathId = pathId;
    }

    public Paths getPaths() {
        return paths;
    }

    public void setPaths(Paths paths) {
        this.paths = paths;
    }

    public String getId() {
        return id;
    }
}
