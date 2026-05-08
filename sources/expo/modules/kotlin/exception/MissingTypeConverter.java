package expo.modules.kotlin.exception;

import defpackage.zf8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lexpo/modules/kotlin/exception/MissingTypeConverter;", "Lexpo/modules/kotlin/exception/CodedException;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MissingTypeConverter extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingTypeConverter(zf8 zf8Var) {
        super("Cannot find type converter for '" + zf8Var + "'. Make sure the class implements `expo.modules.kotlin.records.Record` (i.e. `class MyObj : Record`).", null);
        zf8Var.getClass();
    }
}
