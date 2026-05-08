package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class khg implements ok6 {
    public final Map<String, zgg> a;
    public final vr1 b;
    public final String c;
    public final String d;
    public final d2f e;

    /* JADX WARN: Multi-variable type inference failed */
    public khg(Map<String, ? extends zgg> map, vr1 vr1Var) {
        map.getClass();
        vr1Var.getClass();
        this.a = map;
        this.b = vr1Var;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        String string = uuidRandomUUID.toString();
        string.getClass();
        this.c = string;
        this.d = "multipart/form-data; boundary=".concat(string);
        this.e = new d2f(new z0(this, 24));
    }

    @Override // defpackage.ok6
    public final long a() {
        return ((Number) this.e.getValue()).longValue();
    }

    @Override // defpackage.ok6
    public final void b(ro1 ro1Var) throws EOFException {
        c(ro1Var, true);
    }

    public final void c(ro1 ro1Var, boolean z) throws EOFException {
        StringBuilder sb = new StringBuilder("--");
        String str = this.c;
        sb.append(str);
        sb.append("\r\n");
        ro1Var.Y(sb.toString());
        ro1Var.Y("Content-Disposition: form-data; name=\"operations\"\r\n");
        ro1Var.Y("Content-Type: application/json\r\n");
        StringBuilder sb2 = new StringBuilder("Content-Length: ");
        vr1 vr1Var = this.b;
        sb2.append(vr1Var.h());
        sb2.append("\r\n");
        ro1Var.Y(sb2.toString());
        ro1Var.Y("\r\n");
        ro1Var.v0(vr1Var);
        zn1 zn1Var = new zn1();
        so1 so1Var = new so1(zn1Var);
        Map<String, zgg> map = this.a;
        Set<Map.Entry<String, zgg>> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(t92.r0(setEntrySet, 10));
        int i = 0;
        int i2 = 0;
        for (Object obj : setEntrySet) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u63.o0();
                throw null;
            }
            arrayList.add(new Pair(String.valueOf(i2), u63.Z(((Map.Entry) obj).getKey())));
            i2 = i3;
        }
        f.a(so1Var, lc9.f0(arrayList));
        vr1 vr1VarJ0 = zn1Var.J0(zn1Var.b);
        ro1Var.Y("\r\n--" + str + "\r\n");
        ro1Var.Y("Content-Disposition: form-data; name=\"map\"\r\n");
        ro1Var.Y("Content-Type: application/json\r\n");
        ro1Var.Y("Content-Length: " + vr1VarJ0.h() + "\r\n");
        ro1Var.Y("\r\n");
        ro1Var.v0(vr1VarJ0);
        for (Object obj2 : map.values()) {
            int i4 = i + 1;
            if (i < 0) {
                u63.o0();
                throw null;
            }
            zgg zggVar = (zgg) obj2;
            ro1Var.Y("\r\n--" + str + "\r\n");
            ro1Var.Y("Content-Disposition: form-data; name=\"" + i + '\"');
            if (zggVar.getFileName() != null) {
                ro1Var.Y("; filename=\"" + zggVar.getFileName() + '\"');
            }
            ro1Var.Y("\r\n");
            ro1Var.Y("Content-Type: " + zggVar.getContentType() + "\r\n");
            long jA = zggVar.a();
            if (jA != -1) {
                ro1Var.Y("Content-Length: " + jA + "\r\n");
            }
            ro1Var.Y("\r\n");
            if (z) {
                zggVar.b();
            }
            i = i4;
        }
        ro1Var.Y("\r\n--" + str + "--\r\n");
    }

    @Override // defpackage.ok6
    public final String getContentType() {
        return this.d;
    }
}
