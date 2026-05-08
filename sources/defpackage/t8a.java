package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t8a implements e49, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    @Override // defpackage.e49
    public String getName() {
        return this.name;
    }

    public Object readResolve() {
        return h49.c(getName());
    }
}
