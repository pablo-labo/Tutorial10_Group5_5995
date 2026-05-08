package com.facebook.react.modules.core;

import android.util.JsonWriter;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.JsonWriterHelper;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.JavascriptException;
import defpackage.ap7;
import defpackage.nmc;
import defpackage.s55;
import defpackage.w24;
import java.io.IOException;
import java.io.StringWriter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "ExceptionsManager")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u000f\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/modules/core/ExceptionsManagerModule;", "Lcom/facebook/fbreact/specs/NativeExceptionsManagerSpec;", "Lw24;", "devSupportManager", "<init>", "(Lw24;)V", "", "message", "Lcom/facebook/react/bridge/ReadableArray;", "stack", "", "idDouble", "Lj6g;", "reportFatalException", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;D)V", "reportSoftException", "Lcom/facebook/react/bridge/ReadableMap;", "data", "reportException", "(Lcom/facebook/react/bridge/ReadableMap;)V", "dismissRedbox", "()V", "Lw24;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    public static final String NAME = "ExceptionsManager";
    private final w24 devSupportManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionsManagerModule(w24 w24Var) {
        super(null);
        w24Var.getClass();
        this.devSupportManager = w24Var;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void dismissRedbox() {
        if (this.devSupportManager.f()) {
            this.devSupportManager.i();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportException(ReadableMap data) {
        data.getClass();
        String string = data.getString("message");
        if (string == null) {
            string = "";
        }
        ReadableArray array = data.getArray("stack");
        if (array == null) {
            array = Arguments.createArray();
            array.getClass();
        }
        boolean z = data.hasKey("isFatal") ? data.getBoolean("isFatal") : false;
        String string2 = null;
        if (data.getType("extraData") != ReadableType.Null) {
            try {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                JsonWriterHelper.value(jsonWriter, data.getDynamic("extraData"));
                jsonWriter.close();
                stringWriter.close();
                string2 = stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        if (z) {
            JavascriptException javascriptException = new JavascriptException(ap7.a(string, array));
            javascriptException.a(string2);
            throw javascriptException;
        }
        s55.f("ReactNative", ap7.a(string, array));
        if (string2 != null) {
            s55.a(string2, "ReactNative", "extraData: %s");
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportFatalException(String message, ReadableArray stack, double idDouble) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", message);
        javaOnlyMap.putArray("stack", stack);
        javaOnlyMap.putInt("id", (int) idDouble);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportSoftException(String message, ReadableArray stack, double idDouble) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", message);
        javaOnlyMap.putArray("stack", stack);
        javaOnlyMap.putInt("id", (int) idDouble);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }
}
