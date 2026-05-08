package defpackage;

import androidx.media3.session.i;
import androidx.media3.session.k;
import androidx.media3.session.m;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import com.apollographql.apollo.exception.JsonDataException;
import defpackage.in3;
import defpackage.lz8;
import java.lang.reflect.Constructor;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class akb implements lz8.a, in3.a.InterfaceC0270a, m.a, s.e, x.c {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

    public static int a(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int d(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static long e(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static String j(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String k(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String l(StringBuilder sb, hva hvaVar, String str) {
        sb.append(hvaVar);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder m(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ void n(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3) {
        throw new qi8(str + obj + obj2 + obj3 + ')');
    }

    public static void q(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static /* synthetic */ void r(StringBuilder sb, Object obj) {
        sb.append(" at path ");
        sb.append(obj);
        throw new JsonDataException(sb.toString(), null);
    }

    @Override // in3.a.InterfaceC0270a
    public Constructor b() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(m55.class).getConstructor(null);
    }

    @Override // androidx.media3.session.x.c
    public void c(vdb vdbVar, r.d dVar, List list) {
        vdbVar.B0(list);
    }

    @Override // androidx.media3.session.m.a
    public void f(k kVar) {
        if (((i) kVar).o0()) {
            throw null;
        }
    }

    @Override // androidx.media3.session.s.e
    public void i(r.c cVar, int i) {
        cVar.getClass();
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((v20) obj).getClass();
    }
}
