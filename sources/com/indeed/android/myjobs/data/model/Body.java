package com.indeed.android.myjobs.data.model;

import defpackage.g7;
import defpackage.wl7;
import defpackage.zr4;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/indeed/android/myjobs/data/model/Body;", "", "appStatusJobs", "", "Lcom/indeed/android/myjobs/data/model/AppStatusJob;", "<init>", "(Ljava/util/List;)V", "getAppStatusJobs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Body {
    public static final int $stable = 8;
    private final List<AppStatusJob> appStatusJobs;

    public /* synthetic */ Body(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? zr4.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Body copy$default(Body body, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = body.appStatusJobs;
        }
        return body.copy(list);
    }

    public final List<AppStatusJob> component1() {
        return this.appStatusJobs;
    }

    public final Body copy(List<AppStatusJob> appStatusJobs) {
        return new Body(appStatusJobs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Body) && wl7.b(this.appStatusJobs, ((Body) other).appStatusJobs);
    }

    public final List<AppStatusJob> getAppStatusJobs() {
        return this.appStatusJobs;
    }

    public int hashCode() {
        List<AppStatusJob> list = this.appStatusJobs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return g7.h("Body(appStatusJobs=", ")", this.appStatusJobs);
    }

    public Body(List<AppStatusJob> list) {
        this.appStatusJobs = list;
    }

    public Body() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
