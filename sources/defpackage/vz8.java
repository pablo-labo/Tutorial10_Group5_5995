package defpackage;

import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vz8<Data, ResourceType, Transcode> {
    public final ngb<List<Throwable>> a;
    public final List<? extends qj3<Data, ResourceType, Transcode>> b;
    public final String c;

    public vz8(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<qj3<Data, ResourceType, Transcode>> list, ngb<List<Throwable>> ngbVar) {
        this.a = ngbVar;
        if (list.isEmpty()) {
            l5.q("Must not be empty.");
            throw null;
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final f5d a(int i, int i2, ova ovaVar, a aVar, e.a aVar2) {
        ngb<List<Throwable>> ngbVar = this.a;
        List<Throwable> listAcquire = ngbVar.acquire();
        beb.e(listAcquire, "Argument must not be null");
        List<Throwable> list = listAcquire;
        try {
            List<? extends qj3<Data, ResourceType, Transcode>> list2 = this.b;
            int size = list2.size();
            f5d f5dVarA = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    f5dVarA = list2.get(i3).a(i, i2, ovaVar, aVar, aVar2);
                } catch (GlideException e) {
                    list.add(e);
                }
                if (f5dVarA != null) {
                    break;
                }
            }
            if (f5dVarA != null) {
                return f5dVarA;
            }
            throw new GlideException(this.c, new ArrayList(list));
        } finally {
            ngbVar.a(list);
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
