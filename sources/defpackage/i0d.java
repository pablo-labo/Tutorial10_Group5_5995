package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {93, 95}, m = "invokeSuspend")
public final class i0d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    final /* synthetic */ String $imageAssetsFolder;
    final /* synthetic */ wu5<Integer, Throwable, lu2<? super Boolean>, Object> $onRetry;
    final /* synthetic */ g4a<c79> $result$delegate;
    final /* synthetic */ d79 $spec;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0d(wu5<? super Integer, ? super Throwable, ? super lu2<? super Boolean>, ? extends Object> wu5Var, Context context, d79 d79Var, String str, String str2, String str3, String str4, g4a<c79> g4aVar, lu2<? super i0d> lu2Var) {
        super(2, lu2Var);
        this.$onRetry = wu5Var;
        this.$context = context;
        this.$spec = d79Var;
        this.$imageAssetsFolder = str;
        this.$fontAssetsFolder = str2;
        this.$fontFileExtension = str3;
        this.$cacheKey = str4;
        this.$result$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new i0d(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((i0d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r7 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d1, code lost:
    
        if (r7 == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00d1 -> B:54:0x00d4). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
