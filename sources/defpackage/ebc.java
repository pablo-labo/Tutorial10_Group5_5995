package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ebc implements oec {
    public final String a;

    public ebc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebc) && this.a.equals(((ebc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.oec
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("profileMergeData", this.a);
        return bundle;
    }

    public final String toString() {
        return l5.m("RNAceResumeCreationProps(profileMergeData=", this.a, ")");
    }
}
