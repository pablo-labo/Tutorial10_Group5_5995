package com.rivereactnative;

import app.rive.runtime.kotlin.core.FileAsset;
import app.rive.runtime.kotlin.core.FileAssetLoader;
import com.facebook.react.bridge.ReadableMap;
import defpackage.a74;
import defpackage.aed;
import defpackage.c1f;
import defpackage.e13;
import defpackage.eq3;
import defpackage.eu2;
import defpackage.eze;
import defpackage.f13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.no3;
import defpackage.r6;
import defpackage.r7d;
import defpackage.u63;
import defpackage.uh3;
import defpackage.v03;
import defpackage.wea;
import defpackage.zve;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends FileAssetLoader {
    public final ReadableMap a;
    public final aed b;
    public final eze c;
    public final eu2 d;
    public final LinkedHashMap e;

    @uh3(c = "com.rivereactnative.RiveReactNativeAssetStore$loadContents$1", f = "RiveReactNativeView.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ FileAsset $asset;
        final /* synthetic */ ReadableMap $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReadableMap readableMap, FileAsset fileAsset, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$source = readableMap;
            this.$asset = fileAsset;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return i.this.new a(this.$source, this.$asset, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            try {
                i.this.b.invoke(this.$source, this.$asset);
            } catch (Exception unused) {
            }
            return j6g.a;
        }
    }

    public i(ReadableMap readableMap, aed aedVar) {
        readableMap.getClass();
        this.a = readableMap;
        this.b = aedVar;
        eze ezeVarA = wea.a();
        this.c = ezeVarA;
        eq3 eq3Var = a74.a;
        no3 no3Var = no3.c;
        no3Var.getClass();
        this.d = f13.a(v03.a.C0438a.c(no3Var, ezeVarA));
        this.e = new LinkedHashMap();
    }

    public final void dispose() {
        this.c.h(null);
        f13.c(this.d, null);
        this.e.clear();
    }

    @Override // app.rive.runtime.kotlin.core.FileAssetLoader
    public final boolean loadContents(FileAsset fileAsset, byte[] bArr) {
        ReadableMap map;
        fileAsset.getClass();
        bArr.getClass();
        String uniqueFilename = fileAsset.getUniqueFilename();
        uniqueFilename.getClass();
        int iW = zve.W(uniqueFilename, 0, 6, ".");
        if (iW != -1) {
            uniqueFilename = uniqueFilename.substring(0, iW);
        }
        ReadableMap readableMap = this.a;
        ReadableMap map2 = readableMap.getMap(uniqueFilename);
        if (map2 == null) {
            uniqueFilename = fileAsset.getName();
            map2 = readableMap.getMap(fileAsset.getName());
        }
        if (map2 == null || (map = map2.getMap("source")) == null) {
            return false;
        }
        u63.Y(this.d, null, null, new a(map, fileAsset, null), 3);
        this.e.put(uniqueFilename, fileAsset);
        return true;
    }
}
