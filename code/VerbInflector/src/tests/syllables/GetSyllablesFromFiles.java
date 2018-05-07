package syllables;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import MyFileReader.MyFileReader;



public class GetSyllablesFromFiles {

	private String file;

	public GetSyllablesFromFiles(String fileName){
		this.file = fileName;
	}

	public ArrayList<Integer> getRandomSyllablePossitions(int listSize){
		ArrayList<Integer> rnds = new ArrayList<Integer>();
		try {
			String fileString = MyFileReader.readFileAsString(file);
			StringTokenizer tok = new StringTokenizer(fileString,"\n");
			for(int i=0; i<listSize;){
				int rnd = (int)(Math.random()*tok.countTokens());
				if(!rnds.contains(rnd)){
					rnds.add(rnd);
					i++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return rnds;
	}

	public void makeGivenSyllableListFromFile(){
		try {
			ArrayList<Integer> rnds = new ArrayList<Integer>(Arrays.asList(new Integer[]{
					117270, 190983, 164385, 20670, 3804, 193747, 77032, 118324, 
					182402, 56655, 213505, 198648, 219443, 138619, 233014, 44564, 
					55356, 113024, 190035, 57575, 183402, 160573, 180658, 75816, 
					133198, 200637, 113240, 48175, 86006, 229320, 3567, 204729, 
					73638, 101577, 111589, 233126, 190777, 180645, 166749, 148814, 
					214639, 35242, 1863, 95200, 220852, 198609, 192261, 212813, 
					64873, 202812, 6688, 65843, 109581, 102880, 111754, 85636, 
					100047, 209606, 222748, 175309, 97374, 193091, 207967, 231739, 
					143847, 200231, 60825, 40529, 109136, 71923, 59253, 183605, 
					213556, 157789, 121173, 206422, 62366, 210293, 90146, 170026, 
					67149, 30309, 34381, 182625, 212008, 191557, 134299, 31883, 
					137219, 93735, 55755, 172389, 224040, 172971, 224312, 85293, 
					206858, 73337, 61711, 60765, 225210, 92904, 126232, 131936, 
					51044, 100875, 68190, 174073, 36111, 204010, 111846, 211534, 
					173487, 17925, 60874, 99186, 189981, 182250, 78163, 124554, 
					118108, 220983, 62537, 192940, 116151, 37014, 98795, 18556, 
					176067, 203812, 2111, 58728, 48609, 190559, 108284, 131159, 
					62867, 4125, 192492, 158780, 27103, 47358, 29207, 208217, 31489, 
					118456, 206842, 10923, 66481, 112553, 54619, 121521, 7565, 4447, 
					155097, 203231, 186221, 235711, 147523, 193143, 201052, 81870, 
					138967, 137173, 234529, 103994, 8118, 29317, 81978, 133956, 
					112308, 34199, 210473, 122081, 108728, 168771, 2972, 85241, 
					66416, 181289, 190256, 165431, 195902, 23910, 108022, 198788, 
					45725, 152600, 206130, 142007, 915, 87737, 218553, 161271, 
					31783, 93566, 12319, 204030, 96333, 110093, 187509, 133205, 
					29230, 60200, 151342, 166956, 185546, 151198, 34583, 38118, 
					36695, 91574, 113829, 118508, 217271, 120702, 181542, 49631, 
					118013, 202928, 93092, 152, 73729, 95673, 35894, 88408, 138357, 
					19324, 116038, 25500, 29771, 220418, 93051, 223067, 208937, 
					195355, 93652, 73002, 216460, 233453, 7452, 141972, 103320, 
					16310, 133777, 35749, 221469, 145921, 50912, 181603, 227216, 
					70708, 44844, 93981, 17850, 105302, 183507, 66951, 156650, 
					11637, 94703, 171726, 158847, 140459, 13971, 97757, 47790, 
					178509, 178366, 27923, 182175, 69967, 146010, 107786, 105089, 
					54734, 50423, 71716, 142464, 151485, 23244, 102698, 216302, 
					84777, 24070, 210996, 73990, 32672, 223522, 151834, 28912, 
					181090, 177945, 18560, 54293, 12766, 174014, 8125, 38323, 
					142816, 194106, 9764, 48706, 163848, 66089, 172736, 57716, 
					167994, 116493, 98348, 194936, 19364, 189518, 27418, 17859, 
					173417, 11915, 112187, 116096, 176724, 193902, 75705, 58381, 
					8520, 124448, 210478, 169450, 120651, 134421, 11285, 7579, 
					105701, 96900, 49674, 24594, 121851, 11994, 9633, 63480, 38874, 
					151783, 100829, 199705, 216116, 19924, 155972, 51822, 93831, 
					84013, 61018, 174782, 213786, 218581, 81111, 138576, 127476, 
					22700, 9647, 12051, 15792, 75377, 225972, 17702, 227918, 115789, 
					80536, 167342, 44901, 22933, 61983, 43379, 173904, 136844, 
					159331, 151534, 3485, 148177, 12644, 25837, 194078, 72393, 
					228351, 73356, 144382, 176759, 155329, 224962, 142881, 204338, 
					146990, 161474, 71445, 6805, 200495, 142463, 185201, 207667, 
					81402, 49017, 84613, 105182, 98462, 1734, 224888, 155908, 16634, 
					136169, 204428, 192027, 209766, 161239, 104360, 233122, 156524, 
					69578, 115978, 141297, 34294, 155855, 58530, 33416, 52929, 
					85557, 18431, 221551, 232997, 66306, 18930, 44573, 44449, 
					137527, 58977, 226770, 193006, 113320, 209338, 162317, 124765, 
					69890, 112164, 182600, 11248, 111744, 90568, 79950, 175755, 
					136710, 68249, 166340, 212273, 5769, 107227, 67876, 116840, 
					39537, 143391, 151216, 147790, 162422, 99392, 6718, 1087, 
					160673, 73780, 134684, 107548, 159711, 133550, 39768, 147713, 
					208157, 137878, 159749, 161453, 71102, 100536, 116857, 39969, 
					13669, 147435, 134094, 170953, 24636, 166805, 20560, 219343, 
					184407, 179733, 120886, 24012, 26889, 201614, 104875, 107243, 
					132458, 19968, 177805, 153783, 208019, 148137, 196003, 126397, 
					56906, 21317, 63205, 93760, 46756, 52686, 80086, 224878, 24266, 
					233287, 134063, 217366, 162900, 181877, 92421, 216915, 1079, 
					150922, 86641, 36856, 148362, 60233, 145150, 77856, 18688, 
					76748, 59211, 220939, 165569, 52781, 85858, 46283, 182745, 
					176944, 156177, 167827, 139236, 183829, 79074, 208839, 62459, 
					235098, 191507, 67956, 129061, 171463, 235087, 12378, 130165, 
					89685, 88740, 121328, 87246, 220170, 189564, 100411, 171666, 
					90626, 14087, 45927, 103662, 43375, 106506, 174088, 59346, 
					22864, 88254, 179701, 170793, 36259, 140037, 125900, 56622, 
					210262, 55060, 94884, 216313, 59134, 182519, 157833, 11298, 
					53038, 54032, 168444, 27062, 106722, 129211, 151123, 167538, 
					196827, 153633, 15950, 167222, 98461, 2179, 33789, 232605, 
					155230, 147260, 60888, 83107, 107109, 45352, 111562, 19701, 
					68697, 226739, 28415, 58540, 35604, 15127, 150308, 77883, 
					196469, 130817, 43953, 18521, 177788, 26518, 80204, 69247, 
					80018, 104783, 137107, 70304, 134753, 167796, 44878, 48716, 
					85553, 203831, 163302, 157534, 7181, 178688, 180991, 158517, 
					46366, 211373, 84911, 48571, 33906, 73103, 99598, 224676, 
					197345, 136287, 139508, 229343, 112286, 43373, 229597, 92129, 
					187339, 128953, 8746, 70637, 221831, 172014, 143395, 174299, 
					60148, 135014, 183496, 111277, 228625, 62845, 166387, 95663, 
					54732, 138219, 24176, 212497, 210308, 218990, 88814, 227694, 
					157352, 9716, 89832, 70012, 134114, 191765, 216700, 92036, 
					160863, 170146, 40190, 110172, 146057, 179176, 118643, 206145, 
					98990, 70394, 39221, 145875, 185452, 33133, 186810, 43712, 
					35963, 75292, 159128, 89729, 64521, 105985, 67383, 223279, 
					144226, 88157, 152150, 218428, 28828, 143597, 143709, 59187, 
					168954, 145444, 123548, 198005, 216880, 63974, 9056, 126449, 
					40319, 224077, 95213, 161709, 99528, 130189, 230584, 145432, 
					140638, 112798, 58181, 92091, 222160, 215341, 39860, 63106, 
					29295, 21431, 41684, 207473, 112637, 46227, 209596, 197903, 
					166984, 58011, 22182, 142543, 2492, 5137, 83943, 160680, 117689, 
					75915, 28261, 214872, 105995, 235159, 33507, 109804, 18053, 
					32422, 146526, 82333, 16763, 113189, 77247, 148215, 94107, 
					112737, 192755, 94695, 130760, 213956, 144618, 118913, 163791, 
					169269, 54996, 52749, 201036, 191710, 174461, 221327, 176317, 
					214975, 117898, 127781, 27416, 199452, 90431, 58828, 219022, 
					53544, 141608, 100512, 79556, 150835, 192401, 39713, 115317, 
					2666, 61351, 108093, 168733, 123848, 220632, 74002, 46996, 
					183364, 188625, 74718, 115197, 10319, 120745, 131813, 219210, 
					229795, 95326, 45923, 184648, 67091, 203233, 93600, 28371, 
					95768, 212888, 144565, 193441, 25206, 174576, 184915, 218093, 
					157710, 70617, 75825, 106479, 83352, 53216, 102817, 39043, 
					103800, 160916, 149269, 50670, 88946, 79798, 14780, 143969, 
					41548, 74115, 165687, 92444, 132042, 103305, 44021, 394, 215909, 
					40182, 148237, 186994, 156975, 167059, 120574, 197301, 48793, 
					58240, 93853, 56120, 42112, 54801, 6723, 203120, 109724, 83140, 
					3024, 230595, 717, 112446, 74577, 176497, 37552, 64605, 85348, 
					109291, 31919, 40808, 159639, 108594, 164266, 113504, 150817, 
					68790, 49600, 223032, 26184, 47166, 215766, 182357, 95712, 
					44356, 9813, 33884, 69884, 5671, 119233, 126255, 138130, 77811, 
					126373, 179424, 232314, 112968, 196600, 122913, 227214, 104411, 
					140221, 82860, 130706, 198447, 212592, 69896, 2545, 96326, 
					217023, 86511, 152440, 196433, 185894, 29321, 82955, 190450, 
					77305, 9893, 209721, 181896, 132500, 124590, 100775, 80568, 
					164441, 66285, 77885, 158495, 184937, 114784, 184567, 142994, 
					104521, 153314, 11665, 33959, 230007, 141344, 97746, 183516, 
					144705, 126323, 127559, 223819, 1351, 56874, 215200, 61851, 
					97527, 72481, 88978, 98139, 234964, 116503, 61640, 54328, 
					146183, 39799, 119437, 159777, 227443, 22104, 60161, 41107, 
					75588, 160531, 216205, 8232, 117440, 62244, 35958, 92357, 73081, 
					208510, 131442, 135925
			}));
			String fileString = MyFileReader.readFileAsString(file);
			StringTokenizer tok = new StringTokenizer(fileString,"\n");
			ArrayList<String> ret = new ArrayList<String>();
			ArrayList<String> all = new ArrayList<String>();
			for(; tok.hasMoreTokens();){
				all.add(tok.nextToken());
			}
			for(int i=0; i<rnds.size();i++){
				ret.add(all.get(rnds.get(i))+"\n");
			}
			System.out.println(file);
			System.out.println(ret);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}