/**
 * -----------------------------------------------------------------------------------
 * (c) 2010-2014 OpenInfobutton Project, Biomedical Informatics, University of Utah
 * Contact: {@code <andrew.iskander@utah.edu>}
 * Biomedical Informatics
 * 421 Wakara Way, Ste 140
 * Salt Lake City, UT 84108-3514
 * Day Phone: 1-801-581-4080
 * -----------------------------------------------------------------------------------
 *
 * @author Andrew Iskander {@code <andrew.iskander@utah.edu>}
 * @version Jul 15, 2014
 */
package edu.utah.further.profiledb.service;

import java.util.List;

import edu.utah.further.core.api.context.Api;
import edu.utah.further.profiledb.domain.Profiles;

/**
 * The Interface ProfilesDao.
 */
@Api
public interface ProfilesDao
{

    /**
     * Gets the resource profile.
     *
     * @param id the id
     * @param status the status
     * @param fm the fm
     * @return the resource profile
     */
    public void getResourceProfile( long id, int status, FileandMarker fm );

    /**
     * Count.
     *
     * @param status the status
     * @return the long
     */
    public long count( int status );
    
    public List<Profiles> getProfiles();

    public boolean isBlackListed(String profileTitle, String userId);

}
