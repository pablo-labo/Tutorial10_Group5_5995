package defpackage;

import com.google.gson.JsonIOException;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class de6 implements az2 {
    public Object a;
    public final Object b;

    public de6() {
        this.a = new AtomicReference();
        this.b = new ht0();
    }

    public void a() {
        vci vciVar;
        mci mciVar = (mci) this.b;
        mciVar.b();
        i0i i0iVar = mciVar.a;
        if (i0iVar.V.k(null, djh.o0) && (vciVar = (vci) this.a) != null) {
            mciVar.c.removeCallbacks(vciVar);
        }
        if (i0iVar.V.k(null, djh.C0)) {
            mciVar.f().l0.a(false);
        }
    }

    @Override // defpackage.az2
    public Object convert(Object obj) {
        Charset charsetA;
        ResponseBody responseBody = (ResponseBody) obj;
        ae6 ae6Var = (ae6) this.a;
        ResponseBody.BomAwareReader bomAwareReader = responseBody.a;
        if (bomAwareReader == null) {
            to1 e = responseBody.getE();
            MediaType c = responseBody.getC();
            if (c == null || (charsetA = c.a(a32.b)) == null) {
                charsetA = a32.b;
            }
            bomAwareReader = new ResponseBody.BomAwareReader(e, charsetA);
            responseBody.a = bomAwareReader;
        }
        ae6Var.getClass();
        nb8 nb8Var = new nb8(bomAwareReader);
        nb8Var.b = false;
        try {
            Object objA = ((pvf) this.b).a(nb8Var);
            if (nb8Var.j0() == sb8.Y) {
                return objA;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }

    public de6(mci mciVar) {
        this.b = mciVar;
    }

    public /* synthetic */ de6(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
