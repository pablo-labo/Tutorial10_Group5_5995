package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lsh extends yjh {

    @vph
    private String experimentId;

    @vph
    private String experimentStartTime;

    @vph
    private Long timeToLiveMillis;

    @vph
    private String triggerEvent;

    @vph
    private Long triggerTimeoutMillis;

    @vph
    private String variantId;

    @Override // defpackage.yjh, defpackage.foh, java.util.AbstractMap
    public final /* synthetic */ Object clone() {
        return (lsh) super.clone();
    }

    @Override // defpackage.yjh, defpackage.foh
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ foh clone() {
        return (lsh) super.clone();
    }

    @Override // defpackage.yjh, defpackage.foh
    public final /* synthetic */ void f(Object obj, String str) {
        super.f(obj, str);
    }

    @Override // defpackage.yjh
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ yjh clone() {
        return (lsh) super.clone();
    }

    @Override // defpackage.yjh
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ yjh f(Object obj, String str) {
        super.f(obj, str);
        return this;
    }

    public final void i(Long l) {
        this.timeToLiveMillis = l;
    }

    public final void j(String str) {
        this.experimentId = str;
    }

    public final void k(String str) {
        this.experimentStartTime = str;
    }

    public final void l(String str) {
        this.triggerEvent = str;
    }

    public final void n(String str) {
        this.variantId = str;
    }

    public final void o(Long l) {
        this.triggerTimeoutMillis = l;
    }
}
