package com.google.android.play.core.review;

import android.app.PendingIntent;
import defpackage.ja;

/* JADX INFO: loaded from: classes2.dex */
final class zza extends ReviewInfo {
    public final PendingIntent a;
    public final boolean b;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            ja.k("Null pendingIntent");
            throw null;
        }
        this.a = pendingIntent;
        this.b = z;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReviewInfo)) {
            return false;
        }
        ReviewInfo reviewInfo = (ReviewInfo) obj;
        return this.a.equals(reviewInfo.a()) && this.b == reviewInfo.b();
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.a.toString() + ", isNoOp=" + this.b + "}";
    }
}
