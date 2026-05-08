package defpackage;

import java.util.EnumSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class jq4 implements do2 {
    private do1 _bufferOption;
    private Long _byteLimitGet;
    private Long _byteLimitPost;
    private Map<Integer, Boolean> _customRetryForStatusCodes;
    private Integer _emitRange;
    private p05 _eventStore;
    private Boolean _isPaused;
    private wd4 _maxEventStoreAge;
    private Long _maxEventStoreSize;
    private u3d _requestCallback;
    private Boolean _retryFailedRequests;
    private Boolean _serverAnonymisation;
    private Integer _threadPoolSize;
    private jq4 sourceConfig;

    public final do1 a() {
        do1 do1Var = this._bufferOption;
        if (do1Var != null) {
            return do1Var;
        }
        jq4 jq4Var = this.sourceConfig;
        do1 do1VarA = jq4Var != null ? jq4Var.a() : null;
        if (do1VarA != null) {
            return do1VarA;
        }
        EnumSet<o5f> enumSet = kq4.a;
        return do1.Single;
    }

    public final long b() {
        Long l = this._byteLimitGet;
        if (l != null) {
            return l.longValue();
        }
        jq4 jq4Var = this.sourceConfig;
        Long lValueOf = jq4Var != null ? Long.valueOf(jq4Var.b()) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        EnumSet<o5f> enumSet = kq4.a;
        return kq4.e;
    }

    public final long c() {
        Long l = this._byteLimitPost;
        if (l != null) {
            return l.longValue();
        }
        jq4 jq4Var = this.sourceConfig;
        Long lValueOf = jq4Var != null ? Long.valueOf(jq4Var.c()) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        EnumSet<o5f> enumSet = kq4.a;
        return kq4.f;
    }

    public final Map<Integer, Boolean> d() {
        Map<Integer, Boolean> map = this._customRetryForStatusCodes;
        if (map != null) {
            return map;
        }
        jq4 jq4Var = this.sourceConfig;
        if (jq4Var != null) {
            return jq4Var.d();
        }
        return null;
    }

    public final int e() {
        Integer num = this._emitRange;
        if (num != null) {
            return num.intValue();
        }
        jq4 jq4Var = this.sourceConfig;
        Integer numValueOf = jq4Var != null ? Integer.valueOf(jq4Var.e()) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        EnumSet<o5f> enumSet = kq4.a;
        return kq4.b;
    }

    public final p05 f() {
        p05 p05Var = this._eventStore;
        if (p05Var != null) {
            return p05Var;
        }
        jq4 jq4Var = this.sourceConfig;
        if (jq4Var != null) {
            return jq4Var.f();
        }
        return null;
    }

    public final long g() {
        wd4 wd4Var = this._maxEventStoreAge;
        if (wd4Var != null) {
            return wd4Var.a;
        }
        jq4 jq4Var = this.sourceConfig;
        wd4 wd4Var2 = jq4Var != null ? new wd4(jq4Var.g()) : null;
        if (wd4Var2 != null) {
            return wd4Var2.a;
        }
        EnumSet<o5f> enumSet = kq4.a;
        return kq4.k;
    }

    public final long h() {
        Long l = this._maxEventStoreSize;
        if (l != null) {
            return l.longValue();
        }
        jq4 jq4Var = this.sourceConfig;
        Long lValueOf = jq4Var != null ? Long.valueOf(jq4Var.h()) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        EnumSet<o5f> enumSet = kq4.a;
        return kq4.l;
    }

    public final void i() {
        jq4 jq4Var = this.sourceConfig;
        if (jq4Var != null) {
            jq4Var.i();
        }
    }

    public final boolean j() {
        Boolean bool = this._retryFailedRequests;
        if (bool != null) {
            return bool.booleanValue();
        }
        jq4 jq4Var = this.sourceConfig;
        Boolean boolValueOf = jq4Var != null ? Boolean.valueOf(jq4Var.j()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        EnumSet<o5f> enumSet = kq4.a;
        return kq4.i;
    }

    public final boolean k() {
        Boolean bool = this._serverAnonymisation;
        if (bool != null) {
            return bool.booleanValue();
        }
        jq4 jq4Var = this.sourceConfig;
        Boolean boolValueOf = jq4Var != null ? Boolean.valueOf(jq4Var.k()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        EnumSet<o5f> enumSet = kq4.a;
        return false;
    }

    public final int l() {
        Integer num = this._threadPoolSize;
        if (num != null) {
            return num.intValue();
        }
        jq4 jq4Var = this.sourceConfig;
        Integer numValueOf = jq4Var != null ? Integer.valueOf(jq4Var.l()) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        EnumSet<o5f> enumSet = kq4.a;
        return kq4.h;
    }

    public final boolean m() {
        Boolean bool = this._isPaused;
        if (bool != null) {
            return bool.booleanValue();
        }
        jq4 jq4Var = this.sourceConfig;
        Boolean boolValueOf = jq4Var != null ? Boolean.valueOf(jq4Var.m()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final void n(jq4 jq4Var) {
        this.sourceConfig = jq4Var;
    }
}
