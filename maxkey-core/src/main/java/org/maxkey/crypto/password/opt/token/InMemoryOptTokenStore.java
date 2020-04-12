package org.maxkey.crypto.password.opt.token;

import java.time.Duration;
import org.ehcache.UserManagedCache;
import org.ehcache.config.builders.ExpiryPolicyBuilder;
import org.ehcache.config.builders.UserManagedCacheBuilder;
import org.maxkey.constants.ConstantsTimeInterval;
import org.maxkey.crypto.password.opt.OneTimePassword;

public class InMemoryOptTokenStore {
    protected static final UserManagedCache<String, OneTimePassword> remeberMeStore = 
            UserManagedCacheBuilder.newUserManagedCacheBuilder(String.class, OneTimePassword.class)
                .withExpiry(
                    ExpiryPolicyBuilder.timeToLiveExpiration(
                        Duration.ofMinutes(ConstantsTimeInterval.TWO_WEEK)
                    )
                )
                .build(true);
}