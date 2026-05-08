package defpackage;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class r3c implements Promise {
    public final /* synthetic */ Function1<Object, j6g> a;
    public final /* synthetic */ p3c b;

    public r3c(Function1<Object, j6g> function1, p3c p3cVar) {
        this.a = function1;
        this.b = p3cVar;
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(Throwable th, WritableMap writableMap) {
        th.getClass();
        writableMap.getClass();
        this.b.reject("UnknownCode", null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void resolve(Object obj) {
        this.a.invoke(obj);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, Throwable th) {
        str.getClass();
        this.b.reject(str, null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2, Throwable th) {
        str.getClass();
        this.b.reject(str, str2, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(Throwable th) {
        th.getClass();
        this.b.reject("UnknownCode", null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2) {
        str.getClass();
        this.b.reject(str, str2, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, WritableMap writableMap) {
        str.getClass();
        writableMap.getClass();
        this.b.reject(str, null, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, Throwable th, WritableMap writableMap) {
        str.getClass();
        writableMap.getClass();
        this.b.reject(str, null, th);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2, WritableMap writableMap) {
        str.getClass();
        writableMap.getClass();
        this.b.reject(str, str2, null);
    }

    @Override // com.facebook.react.bridge.Promise
    public final void reject(String str, String str2, Throwable th, WritableMap writableMap) {
        if (str == null) {
            str = "UnknownCode";
        }
        this.b.reject(str, str2, th);
    }

    @Override // com.facebook.react.bridge.Promise
    @sy3
    public final void reject(String str) {
        str.getClass();
        this.b.reject("UnknownCode", str, null);
    }
}
