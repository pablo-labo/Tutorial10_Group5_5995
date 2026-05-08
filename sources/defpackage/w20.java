package defpackage;

import android.app.ApplicationExitInfo;
import android.graphics.BlendMode;
import android.util.JsonReader;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.media3.session.o;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import defpackage.lz8;
import defpackage.x33;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w20 implements x33.a, lz8.a, jg2, p55, x.e, wq2, mhf {
    public final /* synthetic */ int a;

    public static int c(int i, int i2, int i3) {
        return CodedOutputStream.R1(i) + i2 + i3;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo i(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ BlendMode j(Object obj) {
        return (BlendMode) obj;
    }

    public static String k(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static List l(String str, ud2 ud2Var, zr4 zr4Var, zr4 zr4Var2, List list) {
        return u63.Z(new pd2(str, ud2Var, zr4Var, zr4Var2, list));
    }

    public static /* synthetic */ void n(Object obj, int i, int i2, Object obj2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void o(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    public static void p(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static /* synthetic */ void q(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @Override // x33.a
    public Object a(JsonReader jsonReader) {
        return x33.a(jsonReader);
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((vdb) obj).p();
    }

    @Override // defpackage.mhf
    public boolean b(qtc qtcVar, qtc qtcVar2) {
        long jB = qtcVar.b();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L));
        return (fIntBitsToFloat >= qtcVar2.a) & (fIntBitsToFloat < qtcVar2.c) & (fIntBitsToFloat2 >= qtcVar2.b) & (fIntBitsToFloat2 < qtcVar2.d);
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return FirebaseSessionsRegistrar.m28getComponents$lambda3(l7dVar);
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        ((o) sVar).v(dVar);
        throw null;
    }

    @Override // defpackage.p55
    public m55[] h() {
        return new m55[]{new ml5()};
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 4:
                v20Var.getClass();
                break;
            case 5:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    public /* synthetic */ w20(int i) {
        this.a = i;
    }
}
