package com.facebook.react.bridge;

import defpackage.j6g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReadableMapBuilder;", "Lj6g;", "builder", "Lcom/facebook/react/bridge/ReadableMap;", "buildReadableMap", "(Lkotlin/jvm/functions/Function1;)Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ReadableMapBuilderKt {
    public static final ReadableMap buildReadableMap(Function1<? super ReadableMapBuilder, j6g> function1) {
        function1.getClass();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        function1.invoke(new ReadableMapBuilder(writableMapCreateMap));
        return writableMapCreateMap;
    }
}
