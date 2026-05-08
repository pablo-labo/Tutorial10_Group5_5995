package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r5i implements n6d {
    public final Object a;

    public r5i(int i) {
        switch (i) {
            case 2:
                a3a a3aVar = kh7.a;
                this.a = new a3a();
                break;
            default:
                this.a = new oq2();
                break;
        }
    }

    public abstract br8 a(int i, int i2, int i3, long j);

    public List b(ar8 ar8Var, int i, long j) {
        a3a a3aVar = (a3a) this.a;
        List list = (List) a3aVar.b(i);
        if (list != null) {
            return list;
        }
        List<vf9> listD = ar8Var.d(i);
        int size = listD.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(listD.get(i2).R(j));
        }
        a3aVar.h(i, arrayList);
        return arrayList;
    }

    public abstract Object c(JSONObject jSONObject);

    public abstract double d(Object obj, long j);

    @Override // defpackage.n6d
    public Object e(InputStream inputStream) throws IOException {
        try {
            oq2 oq2Var = (oq2) this.a;
            oq2Var.getClass();
            try {
                return c(new JSONObject(((ee3) oq2Var.b).e(inputStream)));
            } catch (JSONException e) {
                throw new IOException(e);
            }
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    public abstract float f(Object obj, long j);

    public abstract void g(Object obj, long j, boolean z);

    public abstract void h(Object obj, long j, byte b);

    public abstract void i(Object obj, long j, double d);

    public abstract void j(Object obj, long j, float f);

    public abstract boolean k(Object obj, long j);

    public r5i(Unsafe unsafe) {
        this.a = unsafe;
    }
}
