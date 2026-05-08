package defpackage;

import okhttp3.Response;
import okhttp3.internal.sse.RealEventSource;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;

/* JADX INFO: loaded from: classes3.dex */
public final class qid extends EventSourceListener {
    public final /* synthetic */ sid a;
    public final /* synthetic */ hg b;
    public final /* synthetic */ hp0 c;
    public final /* synthetic */ vv d;

    public qid(sid sidVar, hg hgVar, hp0 hp0Var, vv vvVar) {
        this.a = sidVar;
        this.b = hgVar;
        this.c = hp0Var;
        this.d = vvVar;
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void a(RealEventSource realEventSource) {
        this.a.c.a("Closed");
        this.d.invoke();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r7.equals("employer-message-updates") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r7.equals("coworker-update") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        if (r7.equals("job-seeker-message-updates") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        r1.a("Received message: ".concat(r8));
        r5 = (defpackage.zx4) r6.b(r8, defpackage.zx4.Companion.serializer(), "parsing event data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
    
        if (r5 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        r7 = r5.c;
        r1.a("data payload: " + r7);
        r5 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        switch(r5.hashCode()) {
            case -1996365784: goto L61;
            case 394855489: goto L55;
            case 674990348: goto L49;
            case 1841354892: goto L43;
            case 2114604933: goto L37;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
    
        if (r5.equals("global--refresh-online-statuses") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ef, code lost:
    
        r5 = (defpackage.twc) r6.b(r7, defpackage.twc.Companion.serializer(), "parsing payload");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        if (r5 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        r6 = new vid.g(r5.c, r5.b, r5.e, r5.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0110, code lost:
    
        if (r5.equals("coworker-suggestions") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0114, code lost:
    
        r5 = (defpackage.q23) r6.b(r7, defpackage.q23.Companion.serializer(), "parsing payload");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0120, code lost:
    
        if (r5 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0122, code lost:
    
        r6 = new vid.b(r5.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
    
        if (r5.equals("coworker-update") != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        r5 = (defpackage.r23) r6.b(r7, defpackage.r23.Companion.serializer(), "parsing payload");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013d, code lost:
    
        if (r5 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013f, code lost:
    
        r6 = new vid.c(r5.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014d, code lost:
    
        if (r5.equals("mm--read-receipt") != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0150, code lost:
    
        r5 = (defpackage.jqc) r6.b(r7, defpackage.jqc.Companion.serializer(), "parsing payload");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015c, code lost:
    
        if (r5 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015e, code lost:
    
        r6 = new vid.h(r5.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016c, code lost:
    
        if (r5.equals("NEW_MESSAGE") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016f, code lost:
    
        r5 = (defpackage.sha) r6.b(r7, defpackage.sha.Companion.serializer(), "parsing payload");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017b, code lost:
    
        if (r5 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017d, code lost:
    
        r6 = new vid.f(r5.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0185, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0186, code lost:
    
        if (r6 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0188, code lost:
    
        r2.invoke(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r7.equals("coworker-suggestions") == false) goto L80;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // okhttp3.sse.EventSourceListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(okhttp3.internal.sse.RealEventSource r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qid.b(okhttp3.internal.sse.RealEventSource, java.lang.String, java.lang.String):void");
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void c(RealEventSource realEventSource, Exception exc) {
        this.a.c.a("Listener: onFailure. Error: " + exc);
        if (exc == null) {
            exc = new Exception("Unknown error in EventSourceListener.onFailure");
        }
        this.c.invoke(exc);
    }

    @Override // okhttp3.sse.EventSourceListener
    public final void d(RealEventSource realEventSource, Response response) {
        sid sidVar = this.a;
        gse gseVar = sidVar.k;
        gseVar.getClass();
        gseVar.m(null, sqc.c);
        sidVar.i = 0;
        EventSource eventSource = sidVar.e;
        if (eventSource != null) {
            eventSource.cancel();
        }
        sidVar.e = null;
    }
}
