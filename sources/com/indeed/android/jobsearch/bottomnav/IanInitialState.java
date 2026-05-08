package com.indeed.android.jobsearch.bottomnav;

import defpackage.gxa;
import defpackage.l6;
import defpackage.wl7;
import defpackage.xj1;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/indeed/android/jobsearch/bottomnav/IanInitialState;", "Ljava/io/Serializable;", "Lxj1;", "initialTab", "Lxj1;", "a", "()Lxj1;", "Lgxa;", "overlayTarget", "Lgxa;", "c", "()Lgxa;", "", "initialUrl", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IanInitialState implements Serializable {
    private final xj1 initialTab;
    private final String initialUrl;
    private final gxa overlayTarget;

    public IanInitialState(xj1 xj1Var, gxa gxaVar, String str, int i) {
        xj1Var = (i & 1) != 0 ? null : xj1Var;
        gxaVar = (i & 2) != 0 ? null : gxaVar;
        str = (i & 4) != 0 ? null : str;
        this.initialTab = xj1Var;
        this.overlayTarget = gxaVar;
        this.initialUrl = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final xj1 getInitialTab() {
        return this.initialTab;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInitialUrl() {
        return this.initialUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final gxa getOverlayTarget() {
        return this.overlayTarget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IanInitialState)) {
            return false;
        }
        IanInitialState ianInitialState = (IanInitialState) obj;
        return this.initialTab == ianInitialState.initialTab && this.overlayTarget == ianInitialState.overlayTarget && wl7.b(this.initialUrl, ianInitialState.initialUrl);
    }

    public final int hashCode() {
        xj1 xj1Var = this.initialTab;
        int iHashCode = (xj1Var == null ? 0 : xj1Var.hashCode()) * 31;
        gxa gxaVar = this.overlayTarget;
        int iHashCode2 = (iHashCode + (gxaVar == null ? 0 : gxaVar.hashCode())) * 31;
        String str = this.initialUrl;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        xj1 xj1Var = this.initialTab;
        gxa gxaVar = this.overlayTarget;
        String str = this.initialUrl;
        StringBuilder sb = new StringBuilder("IanInitialState(initialTab=");
        sb.append(xj1Var);
        sb.append(", overlayTarget=");
        sb.append(gxaVar);
        sb.append(", initialUrl=");
        return l6.i(sb, str, ")");
    }

    public IanInitialState() {
        this(null, null, null, 7);
    }
}
