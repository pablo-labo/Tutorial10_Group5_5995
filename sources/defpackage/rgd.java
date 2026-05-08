package defpackage;

import android.os.Bundle;
import androidx.navigation.r;
import java.util.LinkedHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes.dex */
public final class rgd extends v1 {
    public final up1 b;
    public int c = -1;
    public String d = "";
    public final n7e e = i8e.a;

    public rgd(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.b = new up1(bundle, linkedHashMap);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final <T> T B(i04<? extends T> i04Var) {
        i04Var.getClass();
        return (T) w0();
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final boolean F() {
        String str = this.d;
        up1 up1Var = this.b;
        up1Var.getClass();
        str.getClass();
        r rVar = (r) ((LinkedHashMap) up1Var.d).get(str);
        return (rVar != null ? rVar.a(str, (Bundle) up1Var.c) : null) != null;
    }

    @Override // defpackage.v1
    public final Object P() {
        return w0();
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.ul2
    public final v1 a() {
        return this.e;
    }

    @Override // defpackage.ul2
    public final int p(SerialDescriptor serialDescriptor) {
        String strE;
        up1 up1Var;
        serialDescriptor.getClass();
        int i = this.c;
        do {
            i++;
            if (i >= serialDescriptor.getC()) {
                return -1;
            }
            strE = serialDescriptor.e(i);
            up1Var = this.b;
            up1Var.getClass();
            strE.getClass();
        } while (!((Bundle) up1Var.c).containsKey(strE));
        this.c = i;
        this.d = strE;
        return i;
    }

    @Override // defpackage.v1, kotlinx.serialization.encoding.Decoder
    public final Decoder s(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (ygd.d(serialDescriptor)) {
            this.d = serialDescriptor.e(0);
            this.c = 0;
        }
        return this;
    }

    public final Object w0() {
        String str = this.d;
        up1 up1Var = this.b;
        up1Var.getClass();
        str.getClass();
        r rVar = (r) ((LinkedHashMap) up1Var.d).get(str);
        Object objA = rVar != null ? rVar.a(str, (Bundle) up1Var.c) : null;
        if (objA != null) {
            return objA;
        }
        r40.g(this.d, "Unexpected null value for non-nullable argument ");
        return null;
    }
}
