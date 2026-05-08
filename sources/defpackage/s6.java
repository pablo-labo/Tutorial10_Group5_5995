package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.d;
import defpackage.ij9;
import defpackage.lz8;
import defpackage.roa;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s6 implements lz8.a, ru5, htf, ftg {
    public static String d(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static KotlinNothingValueException e(Object obj) {
        r7d.b(obj);
        return new KotlinNothingValueException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static void g(Integer num, bd0 bd0Var, d dVar) {
        num.getClass();
        bd0Var.getClass();
        dVar.getClass();
    }

    public static /* synthetic */ void h(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new qi8(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new NoSuchElementException(str);
    }

    @Override // defpackage.ftg
    public vrf a(le0 le0Var) {
        return new vrf(le0Var, roa.a.a);
    }

    @Override // defpackage.ru5
    public Object apply(Object obj) {
        ij9.i iVar = (ij9.i) obj;
        iVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ij9.i.h, iVar.a);
        String str = iVar.b;
        if (str != null) {
            bundle.putString(ij9.i.i, str);
        }
        String str2 = iVar.c;
        if (str2 != null) {
            bundle.putString(ij9.i.j, str2);
        }
        int i = iVar.d;
        if (i != 0) {
            bundle.putInt(ij9.i.k, i);
        }
        int i2 = iVar.e;
        if (i2 != 0) {
            bundle.putInt(ij9.i.l, i2);
        }
        String str3 = iVar.f;
        if (str3 != null) {
            bundle.putString(ij9.i.m, str3);
        }
        String str4 = iVar.g;
        if (str4 != null) {
            bundle.putString(ij9.i.n, str4);
        }
        return bundle;
    }

    @Override // defpackage.htf
    public void b(Exception exc) {
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).getClass();
    }
}
