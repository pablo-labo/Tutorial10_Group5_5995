package expo.modules.imagemanipulator;

import defpackage.bb9;
import defpackage.n37;
import defpackage.ohd;
import defpackage.u63;
import defpackage.ya9;
import expo.modules.kotlin.sharedobjects.SharedObject;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/imagemanipulator/ImageManipulatorContext;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "expo-image-manipulator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageManipulatorContext extends SharedObject {
    public final bb9 c;

    public ImageManipulatorContext(ohd ohdVar, bb9 bb9Var) {
        super(ohdVar);
        this.c = bb9Var;
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public final void P() {
        this.c.c.h(null);
    }

    public final void Q(n37 n37Var) {
        bb9 bb9Var = this.c;
        bb9Var.getClass();
        bb9Var.c = u63.l(bb9Var.a, null, new ya9(bb9Var.c, n37Var, null), 3);
    }
}
