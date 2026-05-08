package app.rive.runtime.kotlin.core;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import defpackage.j6g;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "bytes", "Lj6g;", "invoke", "([B)V", "<anonymous>"}, k = 3, mv = {1, DatadogLogGenerator.CRASH, 0})
public final class CDNAssetLoader$loadContents$request$1 extends mj8 implements Function1<byte[], j6g> {
    final /* synthetic */ FileAsset $asset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDNAssetLoader$loadContents$request$1(FileAsset fileAsset) {
        super(1);
        this.$asset = fileAsset;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(byte[] bArr) {
        bArr.getClass();
        this.$asset.decode(bArr);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ j6g invoke(byte[] bArr) {
        invoke2(bArr);
        return j6g.a;
    }
}
