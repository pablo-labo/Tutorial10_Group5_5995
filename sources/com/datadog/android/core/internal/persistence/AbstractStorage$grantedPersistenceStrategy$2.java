package com.datadog.android.core.internal.persistence;

import com.datadog.android.core.persistence.PersistenceStrategy;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.gu5;
import defpackage.mj8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/datadog/android/core/persistence/PersistenceStrategy;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class AbstractStorage$grantedPersistenceStrategy$2 extends mj8 implements gu5<PersistenceStrategy> {
    final /* synthetic */ AbstractStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractStorage$grantedPersistenceStrategy$2(AbstractStorage abstractStorage) {
        super(0);
        this.this$0 = abstractStorage;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.gu5
    public final PersistenceStrategy invoke() {
        return this.this$0.getPersistenceStrategyFactory().create(this.this$0.getSdkCoreId() + "/" + this.this$0.featureName + "/" + TrackingConsent.GRANTED, this.this$0.getStorageConfiguration().getMaxItemsPerBatch(), this.this$0.getStorageConfiguration().getMaxBatchSize());
    }
}
