package com.rivereactnative;

/* JADX INFO: loaded from: classes3.dex */
public enum g {
    FileNotFound("FileNotFound"),
    UnsupportedRuntimeVersion("UnsupportedRuntimeVersion"),
    IncorrectRiveFileUrl("IncorrectRiveFileUrl"),
    IncorrectAnimationName("IncorrectAnimationName"),
    MalformedFile("MalformedFile"),
    IncorrectArtboardName("IncorrectArtboardName"),
    IncorrectStateMachineName("IncorrectStateMachineName"),
    IncorrectStateMachineInput("IncorrectStateMachineInput"),
    TextRunNotFoundError("TextRunNotFoundError"),
    DataBindingError("DataBindingError");

    public static final a a = new a();
    private final String mValue;
    private String message = "Default message";

    public static final class a {
    }

    g(String str) {
        this.mValue = str;
    }

    public final String a() {
        return this.message;
    }

    public final void c(String str) {
        this.message = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.mValue;
    }
}
