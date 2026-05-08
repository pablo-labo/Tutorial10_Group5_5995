package com.indeed.android.jobsearch.deeplink;

import android.content.Intent;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.boa;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.mj8;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.tx5;
import defpackage.vh8;
import defpackage.w8c;
import defpackage.xh8;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class DeeplinkParser implements xh8 {
    public static final Lazy a = boa.E(qt8.a, new a(new DeeplinkParser()));
    public static final tx5 b = new tx5();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/jobsearch/deeplink/DeeplinkParser$DeeplinkMalformedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Landroid/content/Intent;", "intent", "Landroid/content/Intent;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeeplinkMalformedException extends Exception {
        private final Intent intent;

        public DeeplinkMalformedException(Intent intent) {
            this.intent = intent;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return "intent=" + this.intent.toUri(1);
        }
    }

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DeeplinkParser deeplinkParser) {
            super(0);
            this.$this_inject = deeplinkParser;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final Intent a(Intent intent) {
        Intent intent2 = new Intent(intent);
        Iterator<String> it = w8c.a.iterator();
        while (it.hasNext()) {
            intent2.removeExtra(it.next());
        }
        return intent2;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
