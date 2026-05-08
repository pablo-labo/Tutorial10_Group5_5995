package defpackage;

import com.indeed.android.backendservices.data.IndeedAppDatabase;
import defpackage.grg;

/* JADX INFO: loaded from: classes3.dex */
public final class f8a extends grg.d {
    public final gsa b;
    public final IndeedAppDatabase c;

    public f8a(gsa gsaVar, IndeedAppDatabase indeedAppDatabase) {
        gsaVar.getClass();
        indeedAppDatabase.getClass();
        this.b = gsaVar;
        this.c = indeedAppDatabase;
    }

    @Override // grg.d, grg.c
    public final <T extends brg> T c(Class<T> cls) {
        return new e8a(this.b, this.c);
    }
}
