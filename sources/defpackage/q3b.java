package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class q3b extends r3b<Object> {
    public final /* synthetic */ r3b a;

    public q3b(r3b r3bVar) {
        this.a = r3bVar;
    }

    @Override // defpackage.r3b
    public final void a(s3d s3dVar, Object obj) {
        if (obj == null) {
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.a(s3dVar, Array.get(obj, i));
        }
    }
}
