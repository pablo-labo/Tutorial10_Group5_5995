package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import defpackage.z3;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {
    private final String a;
    private final Set b;

    public /* synthetic */ h(String str, Set set, g gVar) {
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest) {
            StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
            String str = this.a;
            if (str != null ? str.equals(standardIntegrityTokenRequest.requestHash()) : standardIntegrityTokenRequest.requestHash() == null) {
                if (this.b.equals(standardIntegrityTokenRequest.verdictOptOut())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() ^ (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String requestHash() {
        return this.a;
    }

    public final String toString() {
        return z3.n(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.a, ", verdictOptOut=", this.b.toString(), "}");
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final Set<Integer> verdictOptOut() {
        return this.b;
    }
}
