
package org.apereo.cas;

import org.apereo.cas.web.flow.CompositeProviderSelectionMultifactorWebflowConfigurerTests;
import org.apereo.cas.web.flow.authentication.GroovyScriptMultifactorAuthenticationProviderSelectorTests;
import org.apereo.cas.web.flow.authentication.RankedMultifactorAuthenticationProviderSelectorTests;
import org.apereo.cas.web.flow.resolver.impl.SelectiveMultifactorAuthenticationProviderWebflowEventResolverTests;

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
    RequestHeaderMultifactorAuthenticationPolicyEventResolverTests.class,
    RequestParameterMultifactorAuthenticationPolicyEventResolverTests.class,
    GroovyScriptMultifactorAuthenticationPolicyEventResolverTests.class,
    AuthenticationAttributeMultifactorAuthenticationPolicyEventResolverTests.class,
    AdaptiveMultifactorAuthenticationPolicyEventResolverTests.class,
    MultifactorAuthenticationTests.class,
    CompositeProviderSelectionMultifactorWebflowConfigurerTests.class,
    SelectiveMultifactorAuthenticationProviderWebflowEventResolverTests.class,
    GroovyScriptMultifactorAuthenticationProviderSelectorTests.class,
    RankedMultifactorAuthenticationProviderSelectorTests.class,
    RequestSessionAttributeMultifactorAuthenticationPolicyEventResolverTests.class,
    TimedMultifactorAuthenticationPolicyEventResolverTests.class
})
@RunWith(JUnitPlatform.class)
public class AllTestsSuite {
}
