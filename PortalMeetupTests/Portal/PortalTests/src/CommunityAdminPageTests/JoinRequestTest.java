package CommunityAdminPageTests;
import org.junit.Assert;
import org.junit.Test;
import BaseTests.CommonTests;
import CommunityAdminPageFeatures.CommunityAdminPage;

/*
 * @author Anjali
 */

/*
 * Checks View of join requests
 */
public class JoinRequestTest extends CommonTests
{

	@Test
	public void test()
	{
		Assert.assertEquals(true, CommunityAdminPage.AreJoinRequestsViewable());
	}

}
