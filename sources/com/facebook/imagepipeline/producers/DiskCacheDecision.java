package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.a;
import defpackage.g47;
import defpackage.po1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class DiskCacheDecision {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/imagepipeline/producers/DiskCacheDecision$DiskCacheDecisionNoDiskCacheChosenException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DiskCacheDecisionNoDiskCacheChosenException extends Exception {
    }

    public static final po1 a(com.facebook.imagepipeline.request.a aVar, po1 po1Var, po1 po1Var2, g47 g47Var) {
        aVar.getClass();
        a.b bVar = aVar.a;
        if (bVar == a.b.a) {
            return po1Var;
        }
        if (bVar == a.b.b) {
            return po1Var2;
        }
        return null;
    }
}
