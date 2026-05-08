package defpackage;

import androidx.compose.runtime.c;
import androidx.compose.runtime.k;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import defpackage.lz8;
import io.jsonwebtoken.security.WeakKeyException;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglThread;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v40 implements lz8.a, EglThread.ReleaseMonitor, jg2, wq2 {
    public final /* synthetic */ int a;

    public static e3a a(c cVar) {
        e3a e3aVar = new e3a();
        cVar.p(e3aVar);
        return e3aVar;
    }

    public static k b(v03 v03Var, c cVar) {
        k kVar = new k(v03Var);
        cVar.p(kVar);
        return kVar;
    }

    public static String c(int i, String str, String str2, String str3) {
        return str + i + str2 + str3;
    }

    public static String e(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    public static String f(String str, m7f m7fVar, String str2, m7f m7fVar2) {
        return str + m7fVar + str2 + m7fVar2;
    }

    public static StringBuilder g(String str, hva hvaVar, String str2, hva hvaVar2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(hvaVar);
        sb.append(str2);
        sb.append(hvaVar2);
        sb.append(str3);
        return sb;
    }

    public static ArrayList h(mb8 mb8Var) {
        mb8Var.m();
        return new ArrayList();
    }

    public static List i(String str, sna snaVar, zr4 zr4Var, zr4 zr4Var2, List list) {
        return u63.Z(new pd2(str, snaVar, zr4Var, zr4Var2, list));
    }

    public static /* synthetic */ void j(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static void l(ue1 ue1Var, rx9 rx9Var) {
        rx9Var.a(new vge(ue1Var));
    }

    public static /* synthetic */ void m(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, int i2, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        throw new WeakKeyException("The " + obj + obj2 + i + ((Object) " bits which is not secure enough for the ") + obj3 + obj4 + obj5 + ((Object) " MUST have a size >= ") + i2 + obj6 + obj7 + obj8 + obj9 + obj10 + obj11 + obj12);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((vdb) obj).n();
    }

    @Override // defpackage.jg2
    public Object d(l7d l7dVar) {
        return FirebaseSessionsRegistrar.m30getComponents$lambda5(l7dVar);
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        v20 v20Var = (v20) obj;
        switch (this.a) {
            case 3:
                v20Var.getClass();
                break;
            case 4:
                v20Var.getClass();
                break;
            default:
                v20Var.getClass();
                break;
        }
    }

    @Override // org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        return EglThread.lambda$create$1(eglThread);
    }

    public /* synthetic */ v40(int i) {
        this.a = i;
    }
}
