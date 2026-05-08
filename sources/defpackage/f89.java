package defpackage;

import com.bumptech.glide.load.engine.f;

/* JADX INFO: loaded from: classes.dex */
public final class f89 extends z79<kg8, f5d<?>> {
    public f d;

    @Override // defpackage.z79
    public final int b(f5d<?> f5dVar) {
        f5d<?> f5dVar2 = f5dVar;
        if (f5dVar2 == null) {
            return 1;
        }
        return f5dVar2.a();
    }

    @Override // defpackage.z79
    public final void c(kg8 kg8Var, f5d<?> f5dVar) {
        f5d<?> f5dVar2 = f5dVar;
        f fVar = this.d;
        if (fVar == null || f5dVar2 == null) {
            return;
        }
        fVar.e.a(f5dVar2, true);
    }
}
