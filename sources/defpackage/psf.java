package defpackage;

import defpackage.psf;

/* JADX INFO: loaded from: classes.dex */
public abstract class psf<CHILD extends psf<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            l5.r(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof psf)) {
            return false;
        }
        char[] cArr = xjg.a;
        return true;
    }

    public int hashCode() {
        return nia.a.hashCode();
    }
}
