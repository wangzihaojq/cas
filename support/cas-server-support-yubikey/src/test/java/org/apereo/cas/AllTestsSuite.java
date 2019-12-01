
package org.apereo.cas;

import org.apereo.cas.adaptors.yubikey.JsonYubiKeyAccountRegistryTests;
import org.apereo.cas.adaptors.yubikey.YubiKeyAuthenticationHandlerTests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 6.0.0-RC3
 */
@SelectClasses({
    JsonYubiKeyAccountRegistryTests.class,
    YubiKeyAuthenticationHandlerTests.class
})
@RunWith(JUnitPlatform.class)
public class AllTestsSuite {
}
