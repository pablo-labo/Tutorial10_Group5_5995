package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import defpackage.h84;
import defpackage.ih5;
import defpackage.n82;
import defpackage.web;

/* JADX INFO: loaded from: classes2.dex */
@h84
@TargetApi(BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA)
public class KitKatPurgeableDecoder extends DalvikPurgeableDecoder {
    @h84
    public KitKatPurgeableDecoder(ih5 ih5Var) {
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap c(n82<PooledByteBuffer> n82Var, BitmapFactory.Options options) {
        n82Var.P().size();
        throw null;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap d(n82<PooledByteBuffer> n82Var, int i, BitmapFactory.Options options) {
        DalvikPurgeableDecoder.e(n82Var, i);
        web.e(Boolean.valueOf(i <= n82Var.P().size()));
        throw null;
    }
}
