package com.linecorp.linesdk;

import android.content.Context;
import android.os.Bundle;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.linecorp.linesdk.api.LineEnvConfig;
import defpackage.b0;
import defpackage.l6;
import defpackage.m6;
import defpackage.o7d;
import defpackage.t40;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/linecorp/linesdk/ManifestParser;", "", "<init>", "()V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Lcom/linecorp/linesdk/api/LineEnvConfig;", "parse", "(Landroid/content/Context;)Lcom/linecorp/linesdk/api/LineEnvConfig;", "line-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ManifestParser {
    public static LineEnvConfig a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.newInstance();
                objNewInstance.getClass();
                if (objNewInstance instanceof LineEnvConfig) {
                    return (LineEnvConfig) objNewInstance;
                }
                b0.o(t40.i(objNewInstance, "Expected instanceof LineEnvConfig, but found: "));
                return null;
            } catch (ReflectiveOperationException e) {
                l6.p(m6.f(cls, "Unable to instantiate LineEnvConfig implementation for "), e);
                return null;
            }
        } catch (ClassNotFoundException e2) {
            throw new IllegalArgumentException("Unable to find LineEnvConfig implementation", e2);
        }
    }

    public final LineEnvConfig parse(Context context) {
        Object aVar;
        String string;
        context.getClass();
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
            aVar = (bundle == null || (string = bundle.getString("LineEnvConfig")) == null) ? null : a(string);
        } catch (Throwable th) {
            aVar = new o7d.a(th);
        }
        return (LineEnvConfig) (aVar instanceof o7d.a ? null : aVar);
    }
}
