package com.microsoft.codepush.react;

import defpackage.l5;
import java.net.MalformedURLException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class CodePushMalformedDataException extends RuntimeException {
    public CodePushMalformedDataException(String str, JSONException jSONException) {
        super(l5.m("Unable to parse contents of ", str, ", the file may be corrupted."), jSONException);
    }

    public CodePushMalformedDataException(String str, MalformedURLException malformedURLException) {
        super(l5.l("The package has an invalid downloadUrl: ", str), malformedURLException);
    }
}
