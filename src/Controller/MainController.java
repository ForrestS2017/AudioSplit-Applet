package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    Button ButtonInsertTrackAfter, ButtonInsertTrackBefore,
            ButtonMoveTrackDown, ButtonMoveTrackUp, ButtonTrackNext,
            ButtonTrackPrevious, ButtonUpdateAlbumCover, ButtonUpdateTrack;

    @FXML
    ImageView ImageViewAlbumCover;

    @FXML
    Label LabelTrackTitle;

    @FXML
    Menu Menu, MenuEdit, MenuHelp, MenuItemOpenRecent;

    @FXML
    MenuItem MenuItemAbout, MenuItemAutoSplit, MenuItemClearAlbumDetails, MenuItemClearTrackList, MenuItemExportAlbum,
            MenuItemImportTrackFile, MenuItemImportTrackLink, MenuItemNew,
            MenuItemOpen, MenuItemReset, MenuItemSave, MenuItemSaveAs;

    @FXML
    Text TextTrackNumber;

    @FXML
    TextField TextFieldAlbum, TextFieldArtists, TextFieldGenre, TextFieldRating,
            TextFieldTrackStartTime, TextFieldTrackTitle, TextFieldYear;

    /**
     * Initialize list
     */

    public void start(Stage mainStage) throws IOException {}


    /**
     *
     * Menu methods
     *
     */

    /**
     * Create a new Album
     */
    @FXML
    public void NewAlbum() {}

    /**
     * Open an Album file
     */
    @FXML
    public void OpenAlbum() {}

    /**
     * Save the currently open Album
     */
    @FXML
    public void SaveAlbum() {}

    /**
     * Save the currently open Album with a specified name
     */
    @FXML
    public void SaveAlbumAs() {}

    /**
     * Import a new Track via link (Youtube). Creates a new Album project
     */
    @FXML
    public void ImportTrackViaLink() {}

    /**
     * Import a new Track via file on disk. Creates a new Album project
     */
    @FXML
    public void ImportTrackViaFile() {}

    /**
     * Automatically split the Track by volume levels
     */
    @FXML
    public void AutoSplit() {}

    /**
     * Export Album based on user's track listings
     */
    @FXML
    public void ExportAlbum() {}

    /**
     * Clear all album details
     */
    @FXML
    public void ClearAlbumDetails() {}

    /**
     * Clear all created tracks for audio file
     */
    @FXML
    public void ClearTrackList() {}

    /**
     * Reset's open project's track lists and album details
     */
    @FXML
    public void MenuItemReset() {}

    /**
     * Display application details
     */
    @FXML
    public void About() {}


    /**
     *
     * List methods
     *
     */


    /**
     * Move Track up (earlier) in list. If only one Track, does nothing.
     */
    @FXML
    public void MoveTrackUp() {}

    /**
     * Move Track down (later) in list. If only one Track, does nothing.
     */
    @FXML
    public void MoveTrackDown() {}


    /**
     *
     * Preview Methods
     *
     */


    /**
     * Update Preview pane to show the previous track's details
     */
    @FXML
    public void ShowPreviousTrack() {}

    /**
     * Update Preview pane to show the next track's details
     */
    @FXML
    public void ShowNextTrack() {}

    /**
     * Load new image to set as the Album cover
     */
    @FXML
    public void UpdateAlbumCover() {}

    /**
     * Add new track before current track. Prepares new Track item in order and clears Preview fields
     */
    @FXML
    public void InsertTrackBefore() {}

    /**
     * Add new track after current track. Prepares new Track item in order and clears Preview fields
     */
    @FXML
    public void InsertTrackAfter() {}

    /**
     * Update current track details
     */
    @FXML
    public void UpdateTrack() {}
}
